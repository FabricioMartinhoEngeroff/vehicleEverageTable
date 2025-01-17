package com.DvFabricio.vehicleAverageTable.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record VehicleData(@JsonAlias("codigo") String code,
                          @JsonAlias("nome") String vehicle) {
}
