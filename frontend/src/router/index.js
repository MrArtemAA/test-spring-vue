import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import Jumbotron from '@/components/Jumbotron'
import RestSample from '@/components/RestSample'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld
    },
    {
      path: '/jumbo',
      name: 'Jumbo',
      component: Jumbotron
    },
    {
      path: '/rest/sample',
      name: 'RestSample',
      component: RestSample
    }
  ]
})
