package com.a;

import sun.security.jca.GetInstance;

/**
 * @author licat.
 * @description 单例模式
 * @since 2022/9/11 8:46 上午
 */

public class Singleton {
    int i;
    int kk;
    int k;
    int d;

    //    饿汉
    private Singleton() {

    }

    private static Singleton instance = new Singleton();

    private static Singleton getInstance() {
        return instance;
    }

    static class SingletonTwo {
        //        懒汉式
        private static SingletonTwo instance = null;

        private SingletonTwo() {
        }

        ;

        public static synchronized SingletonTwo getInstance() {
            if (instance == null) instance = new SingletonTwo();
            return instance;
        }

    }

    //    饿汉
    static class SingletonOne {
        private SingletonOne() {
        }

        ;
        private static SingletonOne instance = new SingletonOne();

        public static SingletonOne getInstance() {
            return instance;
        }
    }

    static class SingletonThree {
        private SingletonThree() {
        }

        ;
        private static SingletonThree instance = new SingletonThree();

        public static SingletonThree getInstance() {
            return instance;
        }
    }

    //饿汉
    static class SingletonFour {
        private SingletonFour() {
        }

        ;
        private static SingletonFour instance = new SingletonFour();

        public static SingletonFour getInstance() {
            return instance;
        }
    }

    //    懒汉
    static class SingletonFive {
        private SingletonFive() {
        }

        ;
        private static SingletonFive instance = null;

        public static synchronized SingletonFive getInstance() {
            if (instance == null) instance = new SingletonFive();
            return instance;
        }
    }

    //    懒汉
    static class SingletonSix {
        private SingletonSix() {
        }

        ;
        private static SingletonSix instance = null;

        public static synchronized SingletonSix getInstance() {
            if (instance == null) instance = new SingletonSix();
            return instance;
        }
    }

    //饿汉
    static class SingletonSeven {
        private SingletonSeven() {
        }

        ;
        private static SingletonSeven instance = new SingletonSeven();

        public static SingletonSeven getInstance() {
            return instance;
        }
    }

    //懒汉
    static class SingletonEight {
        private SingletonEight() {
        }

        ;
        private static SingletonEight instance = null;

        public static synchronized SingletonEight getInstance() {
            if (instance == null) instance = new SingletonEight();
            return instance;
        }
    }
    /**
     * j2ee 包含 servlet jsp ejb(session bean entity bean message bean) jdbc
     *
     * jdk 常用的包:java.io java.util java.sql java.net
     * jdk 和 jre  jdk 是开发工具包,包含 jre,是 java 环境的核心组件
     * jvm 是 java 编程语言的核心,包含内存管理,垃圾回收和安全机制.
     * jre 是具体的实施实现,提供了 java 程序的平台.jre 包含 jvm
     * jre 不包含 java 编译器,调试器之类的开发工具.
     *
     * 覆盖和重载
     *
     * 重写是发生在父子类的某个方法的名称和参数完全相同,子类覆盖父类的方法,只能抛出和父类一样的
     * 或者比父类的精细的异常.访问权限只能比父类相同或者更大.父类是 private 类型,子类不可以重写.
     * 返回值必须一样,
     *
     * 重载:名称相同的方法,只能通过不同的参数形式,参数个数,不同的参数顺序,
     * 不能通过访问权限,返回类型,抛出的异常进行重载.
     * 父类的访问权限是 private 子类不能重载.
     *
     * 构造器不能被继承,不能重写,可以重载.
     *
     *
     *
     * 面向对象:
     *
     * git首次安装必须要用户签名
     * 本地库-暂存区-本地库
     * 初始化本地库,git init
     * 对应目录,初始化本地库
     * git status 查看本地库信息
     * master 当前分支
     * 新建文件 vim xx.txt
     * :wq 保存并退出
     * yy 复制,p 粘贴 cat xx.txt
     * git :文件添加暂存区
     * git add 文件名
     * eg: git add hello.txt
     * 再次重新查看 git 状态
     * git status
     * git rm --cached 文件
     * 删去暂存区的数据,工作区还有数据
     * eg:git rm --cached hello.txt
     * 暂存区提交到本地库(生成历史版本)
     * git commit -m "日志信息" 文件名
     * eg: git commit -m "first" hell0.txt
     * git log 日志信息
     * 修改历史版本
     * vim 文件名
     * git status --->modified:文件名  文件被修改
     * 但是还没有被添加到暂存区,git add  文件名
     * 提交本地库 git commit -m "second" hello.txt
     * git 按行修改信息.
     * 查看版本历史信息
     * git reflog 这是精简版本
     * git log 这是详细版本
     *
     * 版本穿梭,回到之前版本!!!!
     * 查看你想要回去的版本号
     * git reflog (copy 你需要的版本号)
     * git reset --hard 版本号  !!!!
     * git reflog 再次检查
     *
     * git 分支操作
     * 分支类似为主线的副本,实际上是指针的引用
     * 分支好处并行推进,提高开发效率,且不会对其他分支有影响
     * git branch  分支名  创建分支
     * git branch -v      查看分支
     * 切换分支 比如由 master 切换到新分支
     * git checkout 分支名
     * 查看分支 git branch -v *号会指向你正在用的分支
     * 分支上修改内容
     * vim xx.txt  :wq
     * 查看状态 git status
     * 添加暂存区 git add xx, 提交本地库  git commit -m "起名字" 文件名
     * git add 文件名
     * git commit -m "起名字" 文件名
     * 重新检查文件 cat 文件名
     *
     * 分支合并!!!!!!
     * 新的分支合并到 master 分支上
     * 首先分支切回 master 分支 git checkout master
     * git merge 新分支 新分支的内容就会到 master 分支中
     *
     * 代码冲突:两个分支对同一个文件同一个位置发生了不同的修改
     * 两个分支都把各自的内容提交到了本地库
     * 只能手动合并 vim 文件 自己手动更改,esc :wq 保存好
     * 修改好的文件添加到暂存区
     * git add 文件名,提交本地库 不能带文件名
     * git commit -m"版本名"[回车 !不带文件名]
     * 合并只能修改 修改分支的内容,被合并的新分支内容并没有更改
     * 合并分支底层也是指针 head 文件指向具体的分支,分支指向的是版本
     *
     * 代码托管中心 把代码推送到远程服务器
     * git合作两种方式:团队协作,跨团队协作
     * b 不是 a 的团队成员
     * a 的远程库 fork 给 b 的远程库,b 把远程库 clone 到本地库
     * b把本地库 push 到b远程库,b 把 pull request -->a审核-->给 a 的远程库
     *
     * 把代码推送到 github (远程库)上面
     * github
     * git remote -v 查看当前git是否有别名
     * 创建别名
     * git remote add 别名（和库名保持一致） 链接
     * 本地库-暂存区-远程库
     * push 推送
     * 本地库代码推送远程库
     * git push 别名/链接 master（推送的分支）
     * 查看分支下代码 ll
     * git push （库别名） 分支名
     *
     * github从远程库拉取到本地库
     * 更新本地库代码
     * git pull  远程库名 分支
     *
     * 克隆代码
     * 打开/写一个新的文件夹
     * cd /Users/licat./Downloads/ mkdir xxx
     * cd /Users/licat./Downloads/ xxx
     * git init  初始化 git
     * git clone 链接（想要clone的链接）
     * clone不需要登陆账号
     *
     * 团队协作
     * vim 文件名 更改内容
     * 添加暂存区，提交远程库
     * git add 文件名  git commit -m "起个别名吧" 文件名
     * 添加到远程库
     * git push 远程库链接 分支名
     *
     * 把同事邀请进来
     *options-manage access-invite a collaborator 输入同事账号
     * 复制 pending invite 邀请函发给同事
     *
     * 同事自己在github网站复制这个邀请函
     * accept invitation
     * 就能看到代码了，进行更改/推送
     *
     * windows中控制面板-用户账户-凭据管理器
     * 拉取代码到本地 git pull  别名/链接 分支名
     *
     * github网站搜自己的代码 账号名/远程库名
     *
     * 团队外成员帮助开发，依旧是在github网站copy上，发来的pending invite
     * 点击 fork，就可以clone/或者在线编辑
     * commit changes  只是修改了自己的账号
     * 交给那个团队 点击pull request -new pull request-create pull request
     *
     * 团队的github就有pull request了
     * merge pull request-confirm merge
     *
     * github ssh免密登陆
     * 用户-asus-生产.ssh目录
     * cd .ssh  git init
     * ssh-keygen -t rsa -C 账号 （敲三次回车）
     * 会生成一个 公共/私有钥匙
     * 查看公共钥匙
     * mac需要密码 y 输入tooken
     * 然后他会告知密码（公共）存储位置，注意，mac告知位置最后多了一个点，去掉
     * cat 查看那个文件 看你会报权限不足的异常
     * chmod 755 文件路径
     * * chmod -R 755 文件路径
     * 这两个方式都以正确打开文件 .ssh/pub 文件
     * copy密码，添加到github上面
     *idea 红色代表 被git追踪都是还未被管理
     * 绿色代表条件到了暂存区，还没提交本地库
     *
     *
     */
}
