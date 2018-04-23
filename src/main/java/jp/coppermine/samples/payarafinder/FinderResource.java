package jp.coppermine.samples.payarafinder;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.hazelcast.core.HazelcastInstance;

@Path("finder")
@RequestScoped
public class FinderResource {
    
    @Inject
    private HazelcastInstance hazelcastInstance;
    
    @GET
    @Produces("text/plain")
    public String execute() {
        return hazelcastInstance.getCluster().getMembers().toString();
    }
}
