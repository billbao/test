--API
----1, 获取菜品分类： localhost:8080/delivery/rest/getCategories
----2, 获取某一菜品分类下的所有菜： localhost:8080/delivery/rest/getProductsByCat?catId=6
----3, 如果菜品分类是套餐，获取套餐的详细信息： ：
       首先通过 localhost:8080/delivery/rest/getProductsByCat?catId=1获得套餐的信息,套餐也是一个菜样(Product, 属性isPackage=1), 比如此处获得的套餐是ProductId=1
       再获取套餐详细 localshot:8080/delivery/rest/getProductsByPrd?prdId=1 (1为套餐的ProductId)
----4, 菜样的图片url在Product的信息里, 如static/images/test1.jpg, 显示图片url的link可以是localhost:8080/delivery/static/images/test1.jpg