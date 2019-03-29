$(document).ready(function() {
    function update() {
        $.ajax({
            type: 'GET',
            url: '/time',
            timeout: 1000,
            success: function(data) {
                $("#timer").html(data);
                window.setTimeout(update, 1000);
            }
        });
    }
    update();
});