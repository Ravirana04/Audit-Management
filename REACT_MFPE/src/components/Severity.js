import {Table,Button,Badge} from 'react-bootstrap'
export default function Severity() {
   const projectdata =JSON.parse(localStorage.getItem('projectResponse'));
  
  return (
    <div style={{marginLeft:'20%',marginRight:'10%'}}>
      <h5>Project-Details</h5>
      <Table bordered size="sm"  variant="secondary" cellPadding={10} cellSpacing={10}>
        <thead>
          <tr>
          <th>Audit-Tracking-Id</th>
          <th>Project-Manager-Name</th>
          <th>Project Name</th>
          </tr>
        </thead>
        <tbody>
          <tr>
<td>{projectdata.auditId}</td>
<td>{projectdata.managerName}</td>
<td>{projectdata.projectName}</td>



          </tr>
        </tbody>
      </Table>
      <hr/><br/><br/><br/>
      <h5>Audit-Details</h5>
      <Table bordered size="sm"  variant="secondary" cellPadding={10} cellSpacing={10}>
        <thead>
          <tr>
          <th>Project-Execution-Status</th>
          <th>Remedial-Action</th>
          
          </tr>
        </thead>
        <tbody>
          <tr>
<td> <Badge pill bg={(projectdata.projectExecutionStatus=="GREEN")?"success":"danger"} text="dark">
{projectdata.projectExecutionStatus}
  </Badge>{' '}</td>
<td>{projectdata.remedialActionDuration}</td>

          </tr>
        </tbody>
      </Table>
      <br/><br/><br/><br/>
      <Button type="submit" variant="outline-success" style={{textAlign:'center',marginLeft:'28%',marginTop:'100'}} onClick={
         ()=>{
           window.location="/checklist"
         }
       }>Back To Checklist</Button>
    </div>
  )
}
