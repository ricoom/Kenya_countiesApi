package com.ricoom.api.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ricoom.api.models.Constituency;
import com.ricoom.api.models.County;
import com.ricoom.api.repository.CountyRepository;
import com.ricoom.api.service.CountyServices;
@Service
public class CountyServiceImpl implements CountyServices{
	
	
private CountyRepository countyrepo;

	public CountyServiceImpl(CountyRepository countyrepo) {
	
	this.countyrepo = countyrepo;
}

	@Override
	public List<County> getCounties() {
		// TODO Auto-generated method stub
		return countyrepo.findAll();
	}

	@Override
	public List<Constituency> getConstituencies(String county) {
		try {
			
			County _county=	countyrepo.findByname(county);
			if(county!=null) {
				
				 return _county.getConstituencies();

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
		return null;
	}

}
