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
(document).ready(function () {
        $("#save").click(saveData () {
            $.ajax(
            {
                type: "POST", //HTTP POST Method
                url: "/followup/save", // Controller/View 
                data: { //Passing data
                    Name: $("#fname").val(), //Reading text box values using Jquery 
                    City: $("#lname").val(),
                    Address: $("#lname").val()
                }

            });

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
