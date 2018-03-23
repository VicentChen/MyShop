$(function () {
    var url = decodeURI(window.location.href);
    var argsIndex = url.split("?kw=");
    var arg = argsIndex[1];
    console.log(arg);
    $.post("/searchProductByName",{
        productName:arg
    },function (data) {
        console.log(data);
        var items_no = 12;
        var data_length = data.length;
        var pages = Math.ceil(data_length/items_no);
        for(var i=0; i<pages;i++){
            var div = "<div class=\"row page\">";
            div += "<div class=\"tab-content\">";
            var ceiling = items_no*(i+1) > data_length ? data_length : items_no*(i+1);
            for(var j =items_no*i; j<ceiling;j++){
                var url = "/productdetails?productID=" + data[j].productId;
                div += "<div class=\"col-sm-3\">";
                div += "<div class=\"product-image-wrapper\">";
                div += "<div class=\"single-products\">";
                div += "<div class=\"productinfo text-center\">";
                div += "<a href='"+url +"'>" + "<img src=\"images/home/gallery3.jpg\" alt=\"\" />" + "</a>";
                div += "<h2>" + data[j].productPrice + "</h2>";
                div += "<p>" + data[j].productName + " </p>";
                div += "<a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>";
                div += "</div>";
                div += "</div>";
                div += "</div>";
                div += "</div>";
            }
            div += "</div>";
            div += "</div>";
            $('#hidden-result').append(div);
        }
        var initPagination = function(){
            var num = $('#hidden-result div.col-sm-3').length;
            console.log(num);
            $('.pagination').pagination(num,{
                num_edge_entries: 1, //边缘页数
                num_display_entries: 2, //主体页数
                callback: pageselectCallback,
                items_per_page:12//每页显示1项
            });
        }();

        function pageselectCallback(page_index,jq){
            var new_content = $("#hidden-result div.page:eq("+page_index+")").clone();
            $('#pageaaa').empty().append(new_content);
            return false;
        }
    });
});
