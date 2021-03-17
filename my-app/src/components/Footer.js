import React from "react";
// import MDBCol from "mbdreact/MDBCol";
// import MDBContainer from "mbdreact/MDBContainer";
// import MDBRow from "mbdreact/MDBRow";
// import MDBFooter from "mdbreact/MDBFooter";
import { MDBCol, MDBContainer, MDBRow, MDBFooter } from "mdbreact";

const Footer = () => {
    return (
        <div id="footerContainer">
            <MDBFooter className="footer">
                <MDBContainer fluid className="text-center text-md-center">
                    <MDBRow>
                        <MDBCol md="6" className="profLinks">
                            <h5 className="title">Contact:</h5>
                            <p>
                                Phone:
                                <br></br>
                                Email:
                            </p>
                        </MDBCol>
                        <MDBCol md="6" className="profLinks">
                            <h5 className="title">Links:</h5>
                            <ul id="linkList">
                                <li className="list-unstyled">
                                    <a href="https://www.linkedin.com/in/sydney-preston-178ab3124/" class="Links"
                                        target="_blank">Linkedin Profile</a>
                                </li>
                                <li className="list-unstyled">
                                    <a href="https://github.com/Prest261" class="Links" target="_blank">GitHub Profile</a>
                                </li>

                            </ul>
                        </MDBCol>
                    </MDBRow>
                </MDBContainer>
                <div className="footer-copyright text-center py-3">
                    <MDBContainer fluid id="copyright">
                        &copy; {new Date().getFullYear()} Copyright: TaskAssess
                    </MDBContainer>
                </div>
            </MDBFooter>
        </div>
    );
}

export default Footer;