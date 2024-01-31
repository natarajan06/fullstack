import { createBrowserRouter, RouterProvider } from "react-router-dom"
import Spinner from "./components/Spinner.jsx"
import Home from "./components/Home.jsx"
import { Suspense, lazy } from "react"
import Addon from "./components/Addon.jsx"
// import Admin from "./components/Admin/AdminDashboard.jsx"
const LazyLogin = lazy(()=> import("./components/Login.jsx"))
const LazySignup=lazy(()=>import("./components/Signup.jsx"))
import AboutPage from "./About.jsx"
import MobileRechargePlans from "./components/Plan.jsx"
import RechargeButton from "./Rg.jsx"
// import RechargePlans from "./components/Plan.jsx"
import RechargePlans from "./components/Pay.jsx"
import Admin from "./components/Admin.jsx"

import UserGroup from "./components/UserGroup.jsx"
import AdminDashboard from "./components/Dashboard.jsx"


function App() {
  const router= createBrowserRouter([
    {
      path: '/login',
      element: <Suspense fallback={<Spinner/>}><LazyLogin/></Suspense>
    },
    {
      path: '/home',
      element: <Suspense fallback={<Spinner/>}><Home/></Suspense>
    },
    {
      path: '/signup',
      element: <Suspense fallback={<Spinner/>}><LazySignup/></Suspense>
    },
    {
      path: '/addon',
      element: <Suspense fallback={<Spinner/>}><Addon/></Suspense>
    },
   
    {
      path: '/About',
      element: <AboutPage/>
    },
    {
      path: '/Plan',
      element: <MobileRechargePlans/>
    },
    {
      path: '/Rg',
      element: <RechargeButton/>
    },
    {
      path: '/Pay',
      element: <RechargePlans/>
    },
    {
      path: '/admin',
      element: <Admin/>
    },
    {
      path: '/Dashboard',
      element: <AdminDashboard/>
    },
    {
      path: '/usergroup',
      element: <UserGroup/>
    },
    
  ])
  return (
    <RouterProvider router={router}/>
  )
}
export default App
