package com.pretech;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
@Path("/state")
public class StateDetails {
	@GET
	@Path("/{param}")
	@Produces("application/json")
	public String getMsg(@PathParam("param") String state) {
		StringBuilder sb = new StringBuilder();		
//		sb.append("{");
//		sb.append("\"firstName\": \"John\",");
//		sb.append("\"lastName\": \"Smith\",");
//		sb.append("\"age\": 25,");
//		sb.append("\"address\": {");
//		sb.append("\"streetAddress\": \"21 2nd Street\",");
//		sb.append("\"city\": \"New York\",");
//		sb.append("\"state\": \"NY\",");
//		sb.append("\"postalCode\": 10021");
//		sb.append("},");
//		sb.append("\"phoneNumbers\": [");
//		sb.append("{");
//		sb.append("\"type\": \"home\",");
//		sb.append("\"number\": \"212 555-1234\"");
//		sb.append("},");
//		sb.append("{");
//		sb.append("\"type\": \"fax\",");
//		sb.append("\"number\": \"646 555-4567\"");
//		sb.append("}");
//		sb.append("]");
//		sb.append("}");
		sb.append("{");
		sb.append("\"value\"");
		sb.append(":");
		sb.append("\"Pete\"");
		sb.append("}");
		
//		if (state.equals("KL")) {
//			stateDetails = "<State><name>KERALA</name><shortname>KL</shortname>" +
//					"<headq>TRIVANDRUM</headq><language>MALAYALAM</language></State>";
//		} else if (state.equals("KA")) {
//			stateDetails = "<State><name>KARNATAKA</name><shortname>KA</shortname>" +
//					"<headq>BANGALORE</headq><language>KANNADA</language></State>";
//		} else if (state.equals("TN")) {
//			stateDetails = "<State><name>TAMILNADU</name><shortname>TN</shortname>" +
//					"<headq>CHENNAI</headq><language>TAMIL</language></State>";
//		} else {
//			stateDetails = "Data not found";
//		}
		String test = "Chaka Khan let me rock you <br/> Let me rock you Chaka Khan <p> Let me rock you\\r\\nThat's all I wanna do\\r\\nChaka Khan let me rock you\\r\\nLet me rock you Chaka Khan\\r\\nLet me rock you\\r\\nLet me feel for you\\r\\nFeel for you\\r\\nBaby, baby, when I lay with you\\r\\nThere's no place I'd rather be\\r\\nI can't believe, can't believe it's true\\r\\nThe things that you do to me\\r\\nI wouldn't lie to you, baby\\r\\nI'm physically attracted to you\\r\\nThis feeling that I got for you, baby\\r\\nThere's nothing that I wouldn't do\\r\\nI feel for you\\r\\nI think I love you\\r\\nI feel for you\\r\\nI think I love you\\r\\n\\r\\nChaka Khan let me rock you\\r\\nLet me rock you Chaka Khan\\r\\nLet me rock you\\r\\nThat's all I wanna do\\r\\nChaka Khan let me rock you\\r\\nLet me rock you Chaka Khan\\r\\nLet me rock you\\r\\nLet me feel for you\\r\\nFeel for you\\r\\nI feel it too (feel for you)\\r\\nI feel for you (feel for you)\\r\\nI feel for you\\r\\nI think I love you\\r\\nI feel for you\\r\\nI think I love you\\r\\n";
		test = test.replace("\\r\\n", "<br/>");
		return "{\"value\":\""+ test +"\"}";
	}
}