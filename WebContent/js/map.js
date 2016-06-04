window.onload=initMulti;
function initMulti() {
	var map = new BMap.Map("container");
	map.centerAndZoom(new BMap.Point(116.4035,39.915),8);
	map.addControl(new BMap.NavigationControl);
	map.addEventListener("zoomend",function(){
		var zoom = map.getZoom();
		if (zoom > 12) {
			add(map);				
		} else {
			clear(map);				
		}
	});
	map.addEventListener("moveend",function(){
		var zoom = map.getZoom();
		if (zoom > 12) {
			add(map);				
		} else {
			clear(map);				
		}
	});
}
function add(map) {
	var bs = map.getBounds();   //获取可视区域
	var bssw = bs.getSouthWest();   //可视区域左下角
	var bsne = bs.getNorthEast();   //可视区域右上角
//	$("textarea#leftLng").text(bssw.lng);
//	$("textarea#rightLng").text(bsne.lng);
//	$("textarea#upLat").text(bsne.lat);
//	$("textarea#downLat").text(bssw.lat);
	$.ajax({
		url: "find",
		// 数据发送方式
		type: "post",
		// 接受数据格式
		dataType : "json",
		// 要传递的数据
		data : //$("#ll").serializeArray(),
			{
				"bounds.leftLng":bssw.lng,
				"bounds.rightLng":bsne.lng,
				"bounds.upLat":bsne.lat,
				"bounds.downLat":bssw.lat
			},
		// 回调函数，接受服务器端返回给客户端的值，即result值
		success : function(data){
			$.each(data,function(commentIndex,comment) { //遍历返回数组的每一个实体
			var opts = {
					width : 250,     // 信息窗口宽度
					height: 80,     // 信息窗口高度
					enableMessage:true//设置允许信息窗发送短息
			};
			var myIcon = new BMap.Icon("image/serve.png", 
					new BMap.Size(100,80));
				var lng = comment.lng;
				var lat = comment.lat;
				var marker = new BMap.Marker(new BMap.Point(lng,lat),{icon:myIcon});  // 创建标注
				var name =  comment.name;
				var moveIn =  comment.moveIn;
				var moveOut = comment.moveOut;
				var content = name+"服务区进出的车流量：<br/>进入:"+moveIn+"辆<br/>离开:"+moveOut+"辆"
				map.addOverlay(marker);               // 将标注添加到地图中
				addClickHandler(content,marker);
			function addClickHandler(content,marker){
				marker.addEventListener("click",function(e){	//e代表事件，具体还有待深入了解
					openInfo(content,e);
				});
			}
			function openInfo(content,e){
				var p = e.target;
				var point = new BMap.Point(p.getPosition().lng, p.getPosition().lat);
				var infoWindow = new BMap.InfoWindow(content,opts);  // 创建信息窗口对象 
				map.openInfoWindow(infoWindow,point); //开启信息窗口
			}
			});
		},
		error:function(){
			alert("error");
		}
	});
	
}
function clear(map) {
	var bs = map.getBounds();   //获取可视区域
	var bssw = bs.getSouthWest();   //可视区域左下角
	var bsne = bs.getNorthEast();   //可视区域右上角
	if ($("textarea#leftLng").text()!=null) {
		$("textarea#leftLng").text(null);
		$("textarea#rightLng").text(null);
		$("textarea#upLat").text(null);
		$("textarea#downLat").text(null);
	}
	map.clearOverlays();
}