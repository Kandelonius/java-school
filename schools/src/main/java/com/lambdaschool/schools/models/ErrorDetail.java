package com.lambdaschool.schools.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ErrorDetail
{
    // this field layout is specific to our program/company we're working for.
    private String title; // title of exception
    private int status; // Http method status as a number ex 404
    private String detail; // details to the client
    private Date timestamp; // time of exception
    private String developerMessage; // message to developer if needed
    private List<ValidationError> errors = new ArrayList<>(); // list of errors

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public int getStatus()
    {
        return status;
    }

    public void setStatus(int status)
    {
        this.status = status;
    }

    public String getDetail()
    {
        return detail;
    }

    public void setDetail(String detail)
    {
        this.detail = detail;
    }

    public Date getTimestamp()
    {
        return timestamp;
    }

    public void setTimestamp(Date timestamp)
    {
        this.timestamp = timestamp;
    }

    public String getDeveloperMessage()
    {
        return developerMessage;
    }

    public void setDeveloperMessage(String developerMessage)
    {
        this.developerMessage = developerMessage;
    }

    public List<ValidationError> getErrors()
    {
        return errors;
    }

    public void setErrors(List<ValidationError> errors)
    {
        this.errors = errors;
    }
}
