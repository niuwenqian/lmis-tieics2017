package cn.edu.tju.tiei.logistics.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.tju.tiei.logistics.dao.CarrierMapper;
import cn.edu.tju.tiei.logistics.model.Carrier;
import cn.edu.tju.tiei.logistics.service.ICarrierService;

@Service("carrierService")
public class CarrierServiceImpl implements ICarrierService {

	@Resource
	private CarrierMapper carrierMapper;

	public CarrierMapper getCarrierMapper() {
		return carrierMapper;
	}

	@Autowired
	public void setCarrierMapper(CarrierMapper carrierMapper) {
		this.carrierMapper = carrierMapper;
	}

	public List<Carrier> findAll() {
		return carrierMapper.selectByExample(null);
	}

	//@Override
	public Carrier findById(String id) {
		return carrierMapper.selectByPrimaryKey(id);
	}

	//@Override
	public void create(Carrier carrier) {
		carrierMapper.insert(carrier);
	}

	//@Override
	public boolean isExist(Carrier carrier) {
		return carrierMapper.selectByPrimaryKey(carrier.getId()) != null;
	}

	//@Override
	public void update(Carrier carrier) {
		carrierMapper.updateByPrimaryKey(carrier);
	}

	//@Override
	public void deleteById(String id) {
		carrierMapper.deleteByPrimaryKey(id);
	}

	//@Override
	public void deleteAll() {
		carrierMapper.deleteByExample(null);
	}

}
