package com.DvFabricio.vehicleAverageTable.service;

public interface IConvertData {

    <T> T getData(String json, Class<T> classe);
}
