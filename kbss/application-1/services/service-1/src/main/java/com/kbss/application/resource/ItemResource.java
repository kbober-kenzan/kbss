package com.kbss.application.resource;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kbss.application.domain.Item;
import com.kbss.application.repository.IItemRepository;

@Component
@Path("/kbss/item")
public class ItemResource {
	
	@Autowired
	private IItemRepository itemRepo;

	@POST
	@Produces("application/json")
    public Item create(Item item) {
        return itemRepo.save(item);
    }
	
	@GET
	@Produces("application/json")
    public Item read(Long id) {
        return itemRepo.findOne(id);
    }
	
	@PUT
	@Produces("application/json")
    public Item update(Item item) {
        return itemRepo.save(item);
    }
	
	@DELETE
	@Produces("application/json")
    public Long delete(Long id) {
        itemRepo.delete(id);
        return id;
    }
}