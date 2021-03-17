import React from "react";
import Row from "react-bootstrap/Row";
import Col from "react-bootstrap/Col";


const TaskManager = () => {
    return (
        <>
         <Row>
                <Col xs={12} md={12}>
                    <h2>Tasks</h2>
                    <hr></hr>
                </Col>
            </Row>
            <Row>
                <Col>

                    <p class="wrap-text"> Nunc pharetra finibus est at efficitur. Praesent sed congue diam. Integer gravida dui
          mauris, ut interdum nunc egestas sed. Aenean sed mollis diam. Nunc aliquet risus ac finibus
          porta. Nam quis arcu non lectus tincidunt fermentum. Suspendisse aliquet orci porta quam
          semper imperdiet. Praesent euismod mi justo, faucibus scelerisque risus cursus in. Sed
          rhoncus mollis diam, sit amet facilisis lectus blandit at.</p>
                    <p class="wrap-text"> Nunc pharetra finibus est at efficitur. Praesent sed congue diam. Integer gravida dui
          mauris, ut interdum nunc egestas sed. Aenean sed mollis diam. Nunc aliquet risus ac finibus
          porta. Nam quis arcu non lectus tincidunt fermentum. Suspendisse aliquet orci porta quam
          semper imperdiet. Praesent euismod mi justo, faucibus scelerisque risus cursus in. Sed
          rhoncus mollis diam, sit amet facilisis lectus blandit at.</p>

                </Col>
            </Row>
    </>
    )

};

export default TaskManager;