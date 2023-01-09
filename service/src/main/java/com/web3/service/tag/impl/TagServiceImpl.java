package com.web3.service.tag.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.web3.dal.meta.entity.Tag;
import com.web3.dal.meta.mapper.TagMapper;
import com.web3.service.tag.TagService;
import org.springframework.stereotype.Service;

/**
 * @Author: mianyun.yt
 * @Date: 2023/1/3
 */
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements TagService {

    @Override
    public boolean create(String name, String categoryId, String note, String official, String operator) {

        Tag tag = new Tag();
        tag.setName(name);
        tag.setCategoryId(categoryId);
        tag.setNote(note);
        tag.setOfficial(official);
        tag.setCreator(operator);
        tag.setModifier(operator);

        return save(tag);
    }
}
