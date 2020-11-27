package zyc.day03.demo02;
/*
定义方法的完整格式：
修饰符 返回值类型 方法名称(参数类型 参数名称，...){
    方法体;
    return 返回值;
}

修饰符：public static
返回值类型：int double string
方法名称：方法的名字，规则和变量一样，小驼峰
参数类型：进入方法的数据类型
参数名称：进入方法的数据变量名称
PS：参数如果有多个使用逗号进行分隔
方法体：方法需要做的事情
return：1. 停止当前方法
        2. 将返回值还给调用处
返回值：方法执行后最终产生的数据结果

注意事项：
return后面的“返回值”，必须和方法名称前面的返回值类型一致
 */

/*
方法的调用格式：
1. 单独调用：方法名称(参数)
2. 打印调用：System.out.println(方法名称(参数));
3. 赋值调用：数据类型 变量名称 = 方法名称(参数)；
 */
public class Demo02MethodDefine {
    public static void main(String[] args) {
        //单独调用
        sum(10,20);
        System.out.println("==============");
        //打印调用
        System.out.println(sum(10,20));
        System.out.println("==============");
        //赋值调用
        int result = sum(10,20);
        System.out.println("变量值:" + result);
    }
    public static int sum(int a, int b){
        System.out.println("方法执行啦！！！");
        int result = a + b ;
        return result;

    }
}
