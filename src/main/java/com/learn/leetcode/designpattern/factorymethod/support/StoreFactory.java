package com.learn.leetcode.designpattern.factorymethod.support;

/**
 * Description:
 * date: 2021/8/30 12:04
 * Package: com.learn.leetcode.designpattern.factorymethod.support
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
public class StoreFactory {

    /*
      简单工厂，抽象工厂，工厂方法都隶属于创建型设计模式
      简单工厂又叫静态工厂方法，有一个具体的工厂类，可以生产不同的产品,是属于创建型设计模式，但是不属于GOF23种设计模式之一
      简单工厂这个类提供一个可以被外部直接调用的方法，负责实现创建所有实例的内部逻辑
      简单工厂的应用场景：对于产品种类较少的场景，可以考虑简单工厂模式可以很方便的创建所需产品，使用简单工厂的客户端只需要传入工厂类的参数
      不需要关心如何创建对象的逻辑，其实所有创建型设计模式都玩的是隐藏创建对象的逻辑，通常来说简单工厂的表现形式为在工厂类创建对象的方法中通过
      switch case的形式来根据参数选择创建哪个对象，这种方式的缺点很明显，当产品数量多了以后，工厂类会比较臃肿
      简单工厂在jdk源码的应用的话：calendar ，可以很明显的看到calendar类的具体实现类的方式，就是switch case选择

        private static Calendar createCalendar(TimeZone zone,
                                           Locale aLocale){
        CalendarProvider provider =
            LocaleProviderAdapter.getAdapter(CalendarProvider.class, aLocale)
                                 .getCalendarProvider();
        if (provider != null) {
            try {
                return provider.getInstance(zone, aLocale);
            } catch (IllegalArgumentException iae) {
                // fall back to the default instantiation
            }
        }
        Calendar cal = null;
        if (aLocale.hasExtensions()) {
            String caltype = aLocale.getUnicodeLocaleType("ca");
            if (caltype != null) {
                switch (caltype) {
                case "buddhist":
                cal = new BuddhistCalendar(zone, aLocale);
                    break;
                case "japanese":
                    cal = new JapaneseImperialCalendar(zone, aLocale);
                    break;
                case "gregory":
                    cal = new GregorianCalendar(zone, aLocale);
                    break;
                }
            }
        }
     */


    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) return null;
        if (1 == commodityType) return new CouponCommodityService();
        if (2 == commodityType) return new GoodsCommodityService();
        if (3 == commodityType) return new CardCommodityService();
        throw new RuntimeException("不存在的商品服务类型");
    }
}
