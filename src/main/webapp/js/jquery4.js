$(document).ready(function(){
	$('#btn').on('click', function(){
		$.ajax({
			type : 'GET',
			dataType : 'json',
			url : 'searchOpen.do?search='+$('#search').val(),
			success : viewMessage,
			error : function(xhr, textStatus, error){
				alert(xhr.staus);
			}
		});
	});
});

// dataType = json
function viewMessage(data){
	$('#wrap').empty();
	$('#wrap').append('<table><tr><td>title</td><td>firstimage</td><td>mapx</td><td>mapy</td></tr></table>');
	$.each(data.response.body.items.item, function(index, value){
		$('#wrap table').append('<tr><td>' + value.title
				+ '</td><td><a href="'+value.firstimage+'"><img src="' + value.firstimage
				+ '"/></a></td><td>' + value.mapx
				+ '</td><td>' + value.mapy + '</td></tr>');
	});
}// end viewMessage()
