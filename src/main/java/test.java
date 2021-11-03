import java.util.Scanner;

/**
 * Project name(项目名称)：作业_abstract类
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/3
 * Time(创建时间)： 20:17
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    public static void main(String[] args)
    {
        Manager e1 = new Manager("张三", 80000, "项目经理");
        e1.info();
        e1.work();

        Scanner input = new Scanner(System.in);
        Integer year = input.nextInt();
        if ((year % 4 != 0) || (year % 100 == 0 && year % 400 != 0))
        {
            System.out.println("no");
        }
        else
        {
            System.out.println("yes");
        }

        input = new Scanner(System.in);
        double x = input.nextDouble();
        // 求 x 的绝对值。
        /********* Begin *********/
        if (x > 0)
        {
            System.out.println(x);
        }
        else if (x < 0)
        {
            System.out.println(-x);
        }
        else
        {
            System.out.println("ops");
        }

        /********* End *********/

        input.close();
    }
}
