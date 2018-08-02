package cn.edu.tju.tiei.logistics.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.tju.tiei.logistics.dao.ShipperMapper;
import cn.edu.tju.tiei.logistics.model.Shipper;
import cn.edu.tju.tiei.logistics.service.IShipperService;

@Service("shipperService")
public class ShipperServiceImpl implements IShipperService {

	@Resource
	private ShipperMapper shipperMapper;

	public ShipperMapper getShipperMapper() {
		return shipperMapper;
	}

	@Autowired
	public void setShipperMapper(ShipperMapper shipperMapper) {
		this.shipperMapper = shipperMapper;
	}

	public List<Shipper> findAll() {
		return shipperMapper.selectByExample(null);
	}

	//@Override
	public Shipper findById(String id) {
		return shipperMapper.selectByPrimaryKey(id);
	}

	//@Override
	public void create(Shipper shipper) {
		shipperMapper.insert(shipper);
	}

	//@Override
	public boolean isExist(Shipper shipper) {
		return shipperMapper.selectByPrimaryKey(shipper.getId()) != null;
	}

	//@Override
	public void update(Shipper shipper) {
		shipperMapper.updateByPrimaryKey(shipper);
	}

	//@Override
	public void deleteById(String id) {
		shipperMapper.deleteByPrimaryKey(id);
	}

	//@Override
	public void deleteAll() {
		shipperMapper.deleteByExample(null);
	}

}
