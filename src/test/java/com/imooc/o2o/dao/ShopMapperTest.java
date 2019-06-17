package com.imooc.o2o.dao;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.pojo.Area;
import com.imooc.o2o.pojo.Shop;
import com.imooc.o2o.pojo.ShopCategory;
import com.imooc.o2o.pojo.User;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ShopMapperTest extends BaseTest {
    @Autowired
    private ShopMapper shopMapper;
    @Test
    @Ignore
    public void insertShop() {
        Shop shop = new Shop();
        User owner = new User();
        Area area = new Area();
        ShopCategory shopCategory = new ShopCategory();
        area.setAreaId(3);
        owner.setUserId(2);
        shopCategory.setShopCategoryId(1);
        shop.setShopName("香飘飘奶茶店");
        shop.setShopDesc("这是一家感觉清新的小店");
        shop.setShopAddress("西苑一栋33号");
        shop.setShopPhone("13208118963");
        shop.setShopStatus(2);
        shop.setPriority(1);
        shop.setOwner(owner);
        shop.setArea(area);
        shop.setShopCategory(shopCategory);
        shop.setCreateTime(System.currentTimeMillis());
        shop.setLastEditTime(System.currentTimeMillis());
        shop.setAdvice("再接再厉,继续保持");
        int resultCount = shopMapper.insertShop(shop);
        System.out.println(resultCount);
    }
    @Test
    @Ignore
    public void updateShop() {
        Shop shop = new Shop();
        User owner = new User();
        Area area = new Area();
        ShopCategory shopCategory = new ShopCategory();
        area.setAreaId(3);
        owner.setUserId(2);
        shopCategory.setShopCategoryId(1);
        shop.setShopId(2);
        shop.setShopName("美丽的奶茶店");
        shop.setShopDesc("这是一家可以寄托心灵的奶茶店");
        shop.setShopAddress("南苑二栋33号");
        shop.setShopPhone("15887777777");
        shop.setShopStatus(2);
        shop.setPriority(1);
        shop.setOwner(owner);
        shop.setArea(area);
        shop.setShopCategory(shopCategory);
        shop.setCreateTime(System.currentTimeMillis());
        shop.setLastEditTime(System.currentTimeMillis());
        shop.setAdvice("搬到例外一个地方,开始另外一段生活");
        int resultCount = shopMapper.updateShop(shop);
        System.out.println(resultCount);
    }
}
