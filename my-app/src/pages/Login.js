import React, { useState } from "react";
import Row from "react-bootstrap/Row";
import Col from "react-bootstrap/Col";
import Form from "react-bootstrap/Form";
import Button from "react-bootstrap/Button";

const Login = () => {
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");

    function validateForm() {
        return email.length > 0 && password.length > 0;
    }

    function handleSubmit(event) {
        event.preventDefault();
    }

    return (
        // remember => a component(function) can only return ONE thing!!

        <>
            <Row>
                <Col xs={12} md={12}>
                    <h2>Login</h2>
                    <hr></hr>
                </Col>
            </Row>
            <Row>
                <Col>
                    <div className="Login">
                        <Form onSubmit={handleSubmit}>
                            <Form.Group size="lg" controlId="email">
                                <Form.Label>Email</Form.Label>
                                <Form.Control
                                    autoFocus
                                    type="email"
                                    value={email}
                                    onChange={(e) => setEmail(e.target.value)}
                                />
                            </Form.Group>
                            <Form.Group size="lg" controlId="email">
                                <Form.Control
                                    autoFocus
                                    type="password"
                                    value={password}
                                    onChange={(e) => setPassword(e.target.value)}
                                />
                            </Form.Group>
                            <Button block size="lg" type="submit" disabled={!validateForm()}>
                                Login
                            </Button>
                        </Form>

                    </div>

                </Col>
            </Row>

        </>
    )

};

export default Login;