package com.hi.control;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.google.gson.GsonBuilder;
import com.hi.model.Category;
import com.hi.service.CategoryService;

@Path("/rest/")
public class IndexAction {
	private static Logger logger = LogManager.getLogger(IndexAction.class);
	@Autowired
	CategoryService categoryService;
	
	
	@GET
	@Path("/caipin")
	@Produces("application/json")
	public Response getCategories() {
		logger.info("get categories");
		Response.ResponseBuilder b = Response.status(Status.OK);
		GsonBuilder gb = new GsonBuilder();
		List<Category> categories = categoryService.getAllCategories();
		b.entity(gb.create().toJson(categories));
		return b.build();
	}
}
