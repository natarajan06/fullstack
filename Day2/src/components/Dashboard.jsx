import { Progress } from 'rsuite';
import './Dashboard.css';
import CustomSideNav from './CustomSideNav';
const Dashboard =()=>{ 
  const style = {
    width: 120,
    display: 'inline-block',
    marginRight: 10
  };
    return(
       
        <>

        <>
  <link
    href="https://fonts.googleapis.com/css?family=DM+Sans:400,500,700&display=swap"
    rel="stylesheet"
  />
  <CustomSideNav>   </CustomSideNav>
    <div className="page-content">
      <div className="header">DASHBOARD</div>
      <div className="content-categories">
        <div className="label-wrapper">
          <input className="nav-item" name="nav" type="radio" id="opt-1" />
          <label className="category" htmlFor="opt-1">
            All
          </label>
        </div>
        <div className="label-wrapper">
          <input
            className="nav-item"
            name="nav"
            type="radio"
            id="opt-2"
            defaultChecked=""
          />
          <label className="category" htmlFor="opt-2">
            Important
          </label>
        </div>
        <div className="label-wrapper">
          <input className="nav-item" name="nav" type="radio" id="opt-3" />
          <label className="category" htmlFor="opt-3">
            Notes
          </label>
        </div>
        <div className="label-wrapper">
          <input className="nav-item" name="nav" type="radio" id="opt-4" />
          <label className="category" htmlFor="opt-4">
            Links
          </label>
        </div>
      </div>
    
        <div className="task-box red">
          <div className="description-task">
            <div className="task-name">INSTITUTION</div>
          </div>
          <div className="more-button" />
          <div className="members">
            <img
              src="https://images.unsplash.com/photo-1491349174775-aaafddd81942?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=934&q=80"
              alt="member"
            />
            <img
              src="https://images.unsplash.com/photo-1475552113915-6fcb52652ba2?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1934&q=80"
              alt="member-2"
            />
            <img
              src="https://images.unsplash.com/photo-1493752603190-08d8b5d1781d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1600&q=80"
              alt="member-3"
            />
            <img
              src="https://images.unsplash.com/photo-1484688493527-670f98f9b195?ixlib=rb-1.2.1&auto=format&fit=crop&w=2230&q=80"
              alt="member-4"
            />
          </div>
        </div>
        <div className="task-box green">
          <div className="description-task">
            <div className="task-name">ENROLLED COURSES</div>
          </div>
          <div className="more-button" />
          <div className="members">
            <img
              src="https://images.unsplash.com/photo-1523419409543-a5e549c1faa8?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=943&q=80"
              alt="member"
            />
            <img
              src="https://images.unsplash.com/photo-1519742866993-66d3cfef4bbd?ixlib=rb-1.2.1&auto=format&fit=crop&w=881&q=80"
              alt="member-2"
            />
            <img
              src="https://images.unsplash.com/photo-1521122872341-065792fb2fa0?ixlib=rb-1.2.1&auto=format&fit=crop&w=2208&q=80"
              alt="member-3"
            />
            <img
              src="https://images.unsplash.com/photo-1486302913014-862923f5fd48?ixlib=rb-1.2.1&auto=format&fit=crop&w=3400&q=80"
              alt="member-4"
            />
            <img
              src="https://images.unsplash.com/photo-1484187216010-59798e9cc726?ixlib=rb-1.2.1&auto=format&fit=crop&w=955&q=80"
              alt="member-5"
            />
          </div>
          <br></br><br></br>
        </div>
        
        <>
    <div style={style} className="c1">
      <p>ENROLLED</p>
      <Progress.Circle percent={70} strokeColor="green"/>
    </div>
    <div style={style} className="c2">
      <p>UNENROLLED</p>
      <Progress.Circle percent={30}  strokeColor="red"/>
    </div>
    <div style={style} className="c3">
      <p>INSTITUTION</p>
      <Progress.Circle percent={100} />
    </div>
    <div style={style} className="c4">
      <p>COURSES</p>
      <Progress.Circle percent={30}  strokeColor="#ffc107"/>
    </div>
    <div style={style} className="c5">
      <p>STUDENTS ENROLLED</p>
      <Progress.Circle percent={70} strokeColor="grey" />
    </div>
  </>
  <div><p></p><br></br></div>
  <div><p></p><br></br></div><div><p></p><br></br></div><div><p></p><br></br></div>   
    </div>
   
</>

      </>
    )
}
export default Dashboard