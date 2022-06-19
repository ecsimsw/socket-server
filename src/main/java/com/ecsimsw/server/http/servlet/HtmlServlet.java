package com.ecsimsw.server.http.servlet;

import com.ecsimsw.server.http.exception.NotFoundException;
import com.ecsimsw.server.http.request.HttpRequest;
import com.ecsimsw.server.http.response.HttpResponse;
import com.ecsimsw.server.http.response.ResponseFile;

import java.io.IOException;

import static com.ecsimsw.server.config.ServerConfig.INDEX_FILE_PATH;

public class HtmlServlet extends Servlet {

    @Override
    public void doGet(HttpRequest httpRequest, HttpResponse httpResponse) {
        try {
            final ResponseFile file = ResponseFile.of("/hello.html");
            httpResponse.ok(file.asString());
        } catch (IOException e) {
            throw new NotFoundException("no file");
        }
    }
}
