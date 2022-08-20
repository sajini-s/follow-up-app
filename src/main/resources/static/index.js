$(document).ready(function(){

    //Load details when page is loaded
    $.ajax({
        url         : "/followup/all",
        method      : "get",
        contentType : "application/json; charset=utf-8",
        success     : function(data){
            loadData(data);
        }
    });
});


function loadData(followupJSON){
console.log(followupJSON)
    var divContent  = "";
    $.each(followupJSON, function(i, followup){
        divContent  += '<tr>'+
                            '<td data-title="Followup Name">'+
                              followup.title+
                            '</td>' +
                            '<td data-title="Followup Date">'+
                                followup.followupDate+
                            '</td>'+
                            '<td class="select">'+
                                '<a class="button1" href="./pages/edit.html">'+
                                    'Edit'+
                                '</a>'+
                            '</td>'+
                          '</tr>';
    });
    console.log(divContent);
    $("#followupContent").html(divContent);
}