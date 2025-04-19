import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import ruzhubanli from '@/views/modules/ruzhubanli/list'
    import discusschuangweixinxi from '@/views/modules/discusschuangweixinxi/list'
    import feiyongxinxi from '@/views/modules/feiyongxinxi/list'
    import storeup from '@/views/modules/storeup/list'
    import tuizhushenqing from '@/views/modules/tuizhushenqing/list'
    import yajintuihai from '@/views/modules/yajintuihai/list'
    import chuangweixinxi from '@/views/modules/chuangweixinxi/list'
    import laorenxinxi from '@/views/modules/laorenxinxi/list'
    import yonghu from '@/views/modules/yonghu/list'
    import chat from '@/views/modules/chat/list'
    import ruzhushenqing from '@/views/modules/ruzhushenqing/list'
    import config from '@/views/modules/config/list'
    import laifangdengji from '@/views/modules/laifangdengji/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/news',
        name: '公告信息',
        component: news
      }
          ,{
	path: '/ruzhubanli',
        name: '入住办理',
        component: ruzhubanli
      }
          ,{
	path: '/discusschuangweixinxi',
        name: '床位信息评论',
        component: discusschuangweixinxi
      }
          ,{
	path: '/feiyongxinxi',
        name: '费用信息',
        component: feiyongxinxi
      }
          ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
          ,{
	path: '/tuizhushenqing',
        name: '退住申请',
        component: tuizhushenqing
      }
          ,{
	path: '/yajintuihai',
        name: '押金退还',
        component: yajintuihai
      }
          ,{
	path: '/chuangweixinxi',
        name: '床位信息',
        component: chuangweixinxi
      }
          ,{
	path: '/laorenxinxi',
        name: '老人信息',
        component: laorenxinxi
      }
          ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
          ,{
	path: '/chat',
        name: '在线交流',
        component: chat
      }
          ,{
	path: '/ruzhushenqing',
        name: '入住申请',
        component: ruzhushenqing
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
          ,{
	path: '/laifangdengji',
        name: '来访登记',
        component: laifangdengji
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
