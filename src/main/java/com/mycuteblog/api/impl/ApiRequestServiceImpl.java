package com.mycuteblog.api.impl;

import com.mycuteblog.api.ApiRequestService;
import com.mycuteblog.entity.dao.ApiRequestDao;
import com.mycuteblog.entity.model.ApiRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ApiRequestServiceImpl implements ApiRequestService {

    @Autowired
    private ApiRequestDao apiRequestDao;

    @Override
    public void create(ApiRequest apiRequest) {
        apiRequestDao.create(apiRequest);
    }
}
