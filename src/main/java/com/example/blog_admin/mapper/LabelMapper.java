package com.example.blog_admin.mapper;

import com.example.blog_admin.model.Label;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LabelMapper {

    @Insert("INSERT into label(label_name) SELECT #{labelName} WHERE !(SELECT COUNT(label_name) FROM label WHERE label.label_name = #{labelName})")
    void insertLabel(Label label);
}
