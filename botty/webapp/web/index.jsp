<%--
  Created by IntelliJ IDEA.
  User: lmarc
  Date: 2021. 04. 30.
  Time: 8:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Charts</title>
    <link rel="stylesheet" type="text/css" href="./style.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/snap.svg/0.3.0/snap.svg-min.js"></script>
  </head>
  <body>
  <div class="charts-container cf">
    <div class="chart" id="graph-1-container">
      <h2 class="title" id="graph-1-name"></h2>
      <div class="chart-svg">
        <svg class="chart-line" id="chart-1" viewBox="0 0 80 40">
          <defs>
            <clipPath id="clip" x="0" y="0" width="80" height="40" >
              <rect id="clip-rect" x="-80" y="0" width="77" height="38.7"/>
            </clipPath>

            <linearGradient id="gradient-1">
              <stop offset="0" stop-color="#00d5bd" />
              <stop offset="100" stop-color="#24c1ed" />
            </linearGradient>

            <linearGradient id="gradient-2">
              <stop offset="0" stop-color="#954ce9" />
              <stop offset="0.3" stop-color="#954ce9" />
              <stop offset="0.6" stop-color="#24c1ed" />
              <stop offset="1" stop-color="#24c1ed" />
            </linearGradient>


            <linearGradient id="gradient-3" x1="0%" y1="0%" x2="0%" y2="100%">>
              <stop offset="0" stop-color="rgba(0, 213, 189, 1)" stop-opacity="0.07"/>
              <stop offset="0.5" stop-color="rgba(0, 213, 189, 1)" stop-opacity="0.13"/>
              <stop offset="1" stop-color="rgba(0, 213, 189, 1)" stop-opacity="0"/>
            </linearGradient>


            <linearGradient id="gradient-4" x1="0%" y1="0%" x2="0%" y2="100%">>
              <stop offset="0" stop-color="rgba(149, 76, 233, 1)" stop-opacity="0.07"/>
              <stop offset="0.5" stop-color="rgba(149, 76, 233, 1)" stop-opacity="0.13"/>
              <stop offset="1" stop-color="rgba(149, 76, 233, 1)" stop-opacity="0"/>
            </linearGradient>

          </defs>
        </svg>
        <h3 class="valueX">time</h3>
      </div>
      <div class="chart-values">
        <p class="h-value">1689h</p>
        <p class="percentage-value"></p>
        <p class="total-gain"></p>
      </div>
      <div class="triangle green"></div>
    </div>
    <div class="chart" id="graph-2-container">
      <h2 class="title" id="graph-2-name"></h2>
      <div class="chart-svg">
        <svg class="chart-line" id="chart-2" viewBox="0 0 80 40">
        </svg>
        <h3 class="valueX">time</h3>
      </div>
      <div class="chart-values">
        <p class="h-value">322h</p>
        <p class="percentage-value"></p>
        <p class="total-gain"></p>
      </div>
      <div class="triangle red"></div>
    </div>
  </div>
  </div>
  <script src="./scripts.js"></script>
  </body>
</html>
