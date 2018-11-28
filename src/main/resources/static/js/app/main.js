var main = {
	init : function() {
		var _this = this;
		$('#submitKeyword').on('click', function() {
			_this.save();
		});
	},
	save : function () {
		var data = {
			keyword: $('#keyword').val()
		};
        $.post("/",JSON.stringify(data))
		$.ajax({
			type: 'POST',
			url: '/',
			dataType: 'json',
			contentType: 'application/json; charset=utf-8',
			data: JSON.stringify(data)
		}).done(function() {
			alert('sucess');
			location.reload();
		}).fail(function (error) {
			alert(error);
		});
	}
};

main.init();
