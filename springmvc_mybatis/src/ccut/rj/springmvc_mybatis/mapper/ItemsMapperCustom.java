package ccut.rj.springmvc_mybatis.mapper;

import ccut.rj.springmvc_mybatis.pojo.Items;
import ccut.rj.springmvc_mybatis.pojo.ItemsCustom;
import ccut.rj.springmvc_mybatis.pojo.ItemsExample;
import ccut.rj.springmvc_mybatis.pojo.ItemsQueryVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemsMapperCustom {
    //商品查询列表
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo)throws Exception;
}