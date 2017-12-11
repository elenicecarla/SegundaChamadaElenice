package br.edu.univas.si8.ta.fcalc.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/fibcalc")
public interface FCalcService {

	@GET
	@Path("/fib/{num}")
	@Produces(MediaType.APPLICATION_JSON)
	Result fibcalc(@PathParam("num") int num);

}
