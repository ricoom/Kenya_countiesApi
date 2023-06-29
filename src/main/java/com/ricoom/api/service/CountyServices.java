package com.ricoom.api.service;

import java.util.List;

import com.ricoom.api.models.Constituency;
import com.ricoom.api.models.County;

public interface CountyServices {
public List<County> getCounties();
public List<Constituency> getConstituencies(String county);
}
