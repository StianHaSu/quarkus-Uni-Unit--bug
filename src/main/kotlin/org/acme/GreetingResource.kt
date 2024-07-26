package org.acme

import io.smallrye.mutiny.Uni
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path

@Path("/bug")
class GreetingResource {

    @GET
    @Path("/void")
    fun void(): Uni<Void> {
        return Uni.createFrom().nullItem()
    }

    @GET
    @Path("/unit")
    fun unit(): Uni<Unit> {
        return Uni.createFrom().nullItem()
    }
}