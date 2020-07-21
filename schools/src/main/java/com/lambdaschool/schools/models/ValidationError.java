package com.lambdaschool.schools.models;

public class ValidationError
{
    private String code; // the name of the field that caused the error.
    private String message; // send the list to fix

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    @Override
    public String toString()
    {
        return "ValidationError{" +
            "code='" + code + '\'' +
            ", message='" + message + '\'' +
            '}';
    }
}
