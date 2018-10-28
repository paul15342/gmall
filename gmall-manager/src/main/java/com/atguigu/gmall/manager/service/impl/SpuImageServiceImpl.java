package com.atguigu.gmall.manager.service.impl;import com.alibaba.dubbo.config.annotation.Reference;import com.alibaba.dubbo.config.annotation.Service;import com.atguigu.gmall.bean.SpuImage;import com.atguigu.gmall.manager.mapper.SpuImageMapper;import com.atguigu.gmall.service.SpuImageService;import org.springframework.beans.factory.annotation.Autowired;import java.util.List;@Servicepublic class SpuImageServiceImpl implements SpuImageService {    @Autowired    SpuImageMapper spuImageMapper;    @Override    public List<SpuImage> getImageList (String spuId) {        SpuImage spuImage = new SpuImage();        spuImage.setSpuId(spuId);        List<SpuImage> images = spuImageMapper.select(spuImage);        return images;    }}