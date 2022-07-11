import React,{useState,useEffect} from 'react'
import {
 Container,  
  Navbar, 
  Nav,
  Button,
  Badge,
  NavDropdown

} from 'react-bootstrap'
import axios from 'axios';

export default function Header() {
  return (
    
    <div className="sticky-top">
    <Navbar bg="primary"  className="text-light" expand="lg">
  <Container  className="text-light">
    <Navbar.Brand href="#"  className="text-light">Audit Management</Navbar.Brand>
    <Navbar.Toggle aria-controls="basic-navbar-nav" />
    <Navbar.Collapse id="basic-navbar-nav">
      <Nav className="me-auto text-light">
        <Nav.Link href="/login" className="text-light">{(localStorage.getItem("isLoggedIn")?"":"Login")}</Nav.Link>
        <Nav.Link href="/servererror" className="text-light" >{(localStorage.getItem("isLoggedIn")?"":"CheckList")}</Nav.Link>
       
        
        
      </Nav>
      <Nav>
<Button onClick={()=>{
  localStorage.removeItem("username")
   localStorage.clear();
 // localStorage.setItem("username","")

  localStorage.removeItem("Authorization")
  window.location="/login"
  
}} style={{marginLeft:20}}>{(localStorage.getItem("isLoggedIn")?"Logout":"")}</Button>
      </Nav>
    </Navbar.Collapse>
  </Container>
</Navbar>
    </div>
    
  )
}