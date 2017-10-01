$(document).ready(function () {
    $(".btn-select").each(function (e) {
        var value = $(this).find("ul li a.selected").html();
        if (value != undefined) {
            $(this).find(".btn-select-input").val(value);
            $(this).find(".btn-select-value").html(value);
        }
    });
});

$(document).on('click', '.btn-select', function (e) {
    e.preventDefault();
    var ul = $(this).find("ul");
    if ($(this).hasClass("active")) {
    	var li = ui.find("li");
        if (li.find("a").is(e.target)) {
            var target = $(e.target);
            target.addClass("selected").siblings().removeClass("selected");
            var value = target.html();
            $(this).find(".btn-select-input").val(value);
            $(this).find(".btn-select-value").html(value);
        }
        ul.hide();
        $(this).removeClass("active");
    }
    else {
        $('.btn-select').not(this).each(function () {
            $(this).removeClass("active").find("ul").hide();
        });
        ul.slideDown(300);
        $(this).addClass("active");
    }
});

$(document).on('click', function (e) {
    var target = $(e.target).closest(".btn-select");
    if (!target.length) {
        $(".btn-select").removeClass("active").find("ul").hide();
    }
});


$(document).on('click', '#btn-network', function (e) {
    e.preventDefault();
    
    var target = $(e.target);
    target.addClass("selected").siblings().removeClass("selected");
    var value = target.html();
    $(this).find(".btn-select-input").val(value);
    $(this).find(".btn-select-value").html(value);
        
    ul.slideDown(300);
});