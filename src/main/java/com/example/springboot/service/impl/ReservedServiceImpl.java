package com.example.springboot.service.impl;

import com.example.springboot.bean.Reserved;
import com.example.springboot.mapper.ReservedMapper;
import com.example.springboot.service.IReservedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservedServiceImpl implements IReservedService{

    @Autowired
    private ReservedMapper reservedMapper;


    @Override
    public void cancelReservation(int sequence) { reservedMapper.cancelReservation(sequence); }

    @Override
    public List<Reserved> getCurrentReservedById(String userId, String currentTime) {
        return reservedMapper.getCurrentReservedById(userId,currentTime);
    }

    @Override
    public List<Reserved> getHistoryReservedById(String userId, String currentTime) {
        return reservedMapper.getHistoryReservedById(userId,currentTime);
    }
}