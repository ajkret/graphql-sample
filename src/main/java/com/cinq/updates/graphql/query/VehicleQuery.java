package com.cinq.updates.graphql.query;

import com.cinq.updates.graphql.domain.Vehicle;
import com.cinq.updates.graphql.service.VehicleService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleQuery implements GraphQLQueryResolver {

  @Autowired
  private VehicleService vehicleService;

  public List<Vehicle> getVehicles(final int count) {
    return this.vehicleService.getAllVehicles(count);
  }

  public Optional<Vehicle> getVehicle(final int id) {
    return this.vehicleService.getVehicle(id);
  }
}
