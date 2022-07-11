import React, { useState, useEffect } from 'react'
import { Container, Form, Button, Row, Col,Spinner } from 'react-bootstrap';
import axios from 'axios'
export default function CheckList() {
  let finalResponse = [];
  let questionResponse = [];
  const [type, setType] = React.useState("");
  const [managerName, setManagerName] = React.useState("");
  const [projectName, setProjectName] = React.useState("");

  const [data, setdata] = useState([]);
  var heading = ['Question', 'Choices'];
  const [projectdata ,setprojectdata]=useState({});

  const handleAnswer = (questionId, response, question) => {
    if (questionId && response && question) {
      if (
        questionResponse.find((x) => x.questionId === questionId) !== undefined
      ) {
        questionResponse = questionResponse.filter(
          (x) => x.questionId !== questionId
        );
      };      
      // finalResponse = [];
      finalResponse = {};
      let obj = {};
      obj.questionId = questionId;
      obj.question = question;
      obj.auditType = type;
      obj.response = response;
      questionResponse.push(obj);

      let today = new Date();

      let auditDetail = {};
      auditDetail.auditType = type;
      auditDetail.auditDate = today.toISOString(); //"2021-06-17T08:28:57.369Z"; //Date();
      auditDetail.auditQuestions = questionResponse;
     
      // let res = {};
      // res.managerName = managerName;
      // res.projectName = projectName;
      // res.auditDetail = auditDetail;

      finalResponse.managerName = managerName;
      finalResponse.projectName = projectName;
      finalResponse.auditDetail = auditDetail;

      // finalResponse.push(res);
      console.clear();
      console.log(finalResponse);

      //setdata(questionResponse);
    }
  };

  const getprojectdata = async () => {
    console.log(localStorage.getItem('Authorization'),"==================================================")
   await  axios.post("http://localhost:9100/auth/validate", {}, 
    {headers: {"Authorization" : `Bearer ${localStorage.getItem('Authorization')}`}}).then(
      (response) => {
        //success
       
        console.log(response);
         setprojectdata(response.data)
         setManagerName(response.data.name);
         setProjectName(response.data.projectName);
        console.log(response.data,"=============================")
        console.log(projectdata,"++++++++++++++++++++++++++++++")

      }, (error) => {
        //error
        console.log(error);
        console.log("failed +++++++++++++++++++")
      
      }
    );
  };
  useEffect(() => {
    getprojectdata();
  }, []);
  const [search, setsearch] = useState("");
  const postdata = (data) => {
    console.log(localStorage.getItem('Authorization'),"==================================================")
    axios.post("http://localhost:9300/checklist/AuditCheckListQuestions", data, 
    {headers: {"Authorization" : `Bearer ${localStorage.getItem('Authorization')}`}}).then(
      (response) => {
        //success
        console.log(response);
        setdata(response.data)

      }, (error) => {
        //error
        console.log(error);
        console.log("failed +++++++++++++++++++")
      
      }
    );
  };

  const postdata1 = (data) => {
    localStorage.setItem('ServerData',data);
    console.log(data);
    //console.log(localStorage.getItem('Authorization'),"==================================================")
    axios.post("http://localhost:9400/severity/ProjectExecutionStatus", data, 
    {headers: {"Authorization" : `Bearer ${localStorage.getItem('Authorization')}`}}).then(
      (response) => {
        //success
        console.log(response);
        console.log(response.data)
       localStorage.setItem('projectResponse', JSON.stringify(response.data))
       console.log(JSON.parse(localStorage.getItem('projectResponse')),"============================++======")
        alert("data sent to db")
        window.location="/severity"

      }, (error) => {
        //error
        console.log(error);
        console.log("failed +++++++++++++++++++")

      }
    );
  };

  const handleSubmit1 = (e) => {
  
    e.preventDefault();
    // console.log(search)
     postdata1(finalResponse);  
  };

  const handleSubmit = (e) => {

    console.log(search)
    postdata({ "auditType": search })
    e.preventDefault();

  };


  return (
    <div >

      <Container className="mt-3 text-center">
        <Form onSubmit={handleSubmit}>
          <Row>
            <Col sm={1}></Col>
            <Col sm={3}>
              <Form.Label>Choose Audit type:</Form.Label>
            </Col>
            <Col sm={3}>
              <Form.Group className="mb-3" controlId="Slot">

                <Form.Select aria-label="Default select example" onChange={(e) => {
                  setType(e.target.value)
                  setsearch(e.target.value)
                }}>
                  <option>Select Audit Type</option>
                  <option value="Internal">Internal</option>
                  <option value="SOX">SOX</option>

                </Form.Select>
              </Form.Group>
            </Col>
            <Col sm={3}>
              <Button type="submit" variant="outline-success">See Questions</Button>
            </Col>
            <Col sm={2}></Col>
          </Row>
        </Form>
      </Container>

      <Container>
      {/* <Form onSubmit={handleSubmit1}> */}
     
        {
          (data.length > 0) ?
            <table striped bordered hover variant="dark" cellPadding={10} cellSpacing={10} style={{ width: 900, marginTop: '20', marginLeft: '10' }}>
              <thead>
                <tr>
                  {heading.map(head => <th>{head}</th>)}
                </tr>
              </thead>
              <tbody >
                {
                  data.length>0?data.map(item => <tr key={item.questionId}>
                    <td>{item.question}</td>
                    <td>
                    <Button
                      onClick={() =>
                        handleAnswer(item.questionId, "Yes", item.question)
                      }
                    >
                      Yes
                    </Button>{" "}
                    <Button
                      onClick={() =>
                        handleAnswer(item.questionId, "No", item.question)
                      }
                    >
                      No
                    </Button>
                    
                    
                    </td>
                    <td></td>




                  </tr>)
                  :''}

              </tbody>
            </table>
             :
             ''
         
       }
       {data.length>0 &&  
       <Button type="submit" variant="outline-success" style={{textAlign:'center',marginLeft:'28%',marginTop:'100'}} 
       onClick={
         (e)=> handleSubmit1(e)
       }>submit</Button>}
        
       
      </Container>
      
    </div>

  )
}