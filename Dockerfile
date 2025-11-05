FROM alpine
EXPOSE 80
RUN apk add nginx
COPY ./ordinario-FTW /var/lib/nginx/html
COPY ./Luis.conf /etc/nginx/http.d/default.conf
CMD ["nginx", "-g", "daemon off;"]