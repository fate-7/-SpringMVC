package ccut.rj.springmvc_mybatis.junit;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ccut.rj.springmvc_mybatis.mapper.ItemsMapperCustom;
import ccut.rj.springmvc_mybatis.pojo.Items;
import ccut.rj.springmvc_mybatis.pojo.ItemsCustom;
import ccut.rj.springmvc_mybatis.pojo.ItemsQueryVo;

public class TestMybatis {
	private ApplicationContext ac;

	@Test
	public void testMapper() throws Exception {
		ac = new ClassPathXmlApplicationContext("spring/applicationContext-dao.xml");

		ItemsMapperCustom imc = (ItemsMapperCustom) ac.getBean(ItemsMapperCustom.class);

		Items items = new Items();
		items.setName("笔记本");

		ItemsQueryVo itemsQueryVo = new ItemsQueryVo();
		itemsQueryVo.setItems(items);

		List<ItemsCustom> itemsList = imc.findItemsList(itemsQueryVo);

		for (ItemsCustom itemsCustom : itemsList) {
			System.out.println(itemsCustom.toString());
		}
	}
	
}
