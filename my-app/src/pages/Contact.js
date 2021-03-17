import React from "react";
import Form from "react-bootstrap/Form";
import Button from "react-bootstrap/Button";
import InputGroup from "react-bootstrap/InputGroup";
import FormControl from 'react-bootstrap/FormControl';

const Contact = () => {
    return (
        <>
            <h2>Contact</h2>
            <hr></hr>
            <Form id="contactForm">

                <InputGroup className="mb-3">
                    <InputGroup.Prepend>
                        <InputGroup.Text id="basic-addon1">First Name</InputGroup.Text>
                    </InputGroup.Prepend>
                    <FormControl
                        aria-label="Firstname"
                        aria-describedby="basic-addon1"
                    />
                </InputGroup>

                <InputGroup className="mb-3">
                    <InputGroup.Prepend>
                        <InputGroup.Text id="basic-addon2">Last Name</InputGroup.Text>
                    </InputGroup.Prepend>
                    <FormControl
                        aria-label="Lastname"
                        aria-describedby="basic-addon2"
                    />
                </InputGroup>

                <InputGroup className="mb-3">
                    <InputGroup.Prepend>
                        <InputGroup.Text id="basic-addon3">Email</InputGroup.Text>
                    </InputGroup.Prepend>
                    <FormControl
                        aria-label="Email"
                        aria-describedby="basic-addon3"
                    />
                </InputGroup>

                <InputGroup>
                    <InputGroup.Prepend>
                        <InputGroup.Text id="basic-addon4">Message</InputGroup.Text>
                    </InputGroup.Prepend>
                    <FormControl as="textarea" aria-label="With textarea" />
                </InputGroup>

                <Button variant="primary" type="submit" id="submitBtn">
                    Submit
            </Button>
            </Form>
        </>
    )
};

export default Contact;