$(document).ready(function(){
	
	var news= "This is the News...";
	var info= "This is the Info";
	var lyrics = "This is the Lyrics";
	var title = "Joy Division - Closer - Isolation";
	
	checkStatus();
    //setInterval(checkStatus,1000);

  $("#Lyrics").click(function(){
	    //alert('Lyrics');
	    $("#text").text(lyrics);
	    $("#header").text(title);
	  });
  $("#Info").click(function(){
	    //alert('Info');
	  $("#text").text(info);
	  });
  $("#News").click(function(){
	  $("#text").text(news);
	  });
	  
	  $('<input type="radio" name="radio-choice-1" id="radio-choice-4"><label for="radio-choice-4">Cow</label>').appendTo("fieldset");

      $("div").trigger('create');
      $("input[type='radio']").checkboxradio().checkboxradio("refresh");
});

/*
 * Call a Restful Web Service
 */

/**
 * Call restful web service to get the statistics
 * Then show/hide button depending on the result.
 */
function checkStatus()
{
    //http://stackoverflow.com/questions/8922343/dynamically-creating-vertically-grouped-radio-buttons-with-jquery
	$.ajax({

    	dataType: 'json',
        headers: {
            Accept:"application/json",
            "Access-Control-Allow-Origin": "*"
        },
        type:'GET',
        url:'http://d067e5492684:8090/com.upnp.mediainfo.web/pretech/state/Pete,Test',
        success: function(data)
        {
        	var test = data.value;
        	test = test.replace("\r\n", "<br/>");
        	$("#text").html(test);
        },
        error: function (result) {
        	alert("Error " + result);
        }
    });
}