/**
 * Created by Administrator on 2016/11/25.
 */
var dataDpr = $('html').attr('data-dpr');
var fontSize = 0;
if (dataDpr == 1) {
    fontSize = 10;
} else if (dataDpr == 2) {
    fontSize = 20;
} else if (dataDpr == 3) {
    fontSize = 30;
}
// 基于准备好的dom，初始化echarts实例
var myChart1 = echarts.init(document.getElementById('chart1'));
var myChart2 = echarts.init(document.getElementById('chart2'));

//今日走势
var lineData = [];
var lineDate = [];

function linePosition() {
    $('.line-top').css('top',dataDpr*12);
    $('.line-middle').css('top','50%');
    $('.line-bottom').css('bottom',dataDpr*20);
}
linePosition();

lineOption = {
    tooltip: {
        trigger: 'axis',
        confine: true,
        backgroundColor: 'rgba(51,51,51,0.78)',
        padding: [5, 15],
        position: function (pt) {
            return [pt[0], '10%'];
        },
        axisPointer: {
            animation:false,
            lineStyle: {
                color: '#e84200',
                width: 1
            }
        },
        formatter: function (params) {
            params = params[0];
            var date = params.name;
            return date + '<br>' + '当前价：' + params.value + "  ";
        },
        textStyle: {
            fontSize: fontSize,
            color: '#fff'
        }
    },
    grid: {
        left: dataDpr * 12,
        top: dataDpr * 12,
        right: dataDpr * 12,
        bottom: dataDpr * 20
    },
    xAxis: {
        type: 'category',
        splitLine: {
            show: false,
            lineStyle:{
                type:'dotted'
            }
        },
        axisTick: {
            show: false
        },
        axisLine: {
            show: false,
            onZero: false
        },
        axisLabel: {
            textStyle: {
                fontSize: fontSize,
                color: '#999'
            },
            interval:9
        },
        data: lineDate
    },
    yAxis: {
        type: 'value',
        boundaryGap: ['20%', '20%'],
        scale:true,
        splitLine: {
            show: false,
            lineStyle:{
                color:'#ddd',
                type:'solid'
            }
        },
        axisLine: {
            show: false,
            onZero: false
        },
        axisTick: {
            show: false
        },
        axisLabel: {
            textStyle: {
                fontSize: fontSize,
                color: '#999',
            },
            inside:true
        },
        z: 3
    },
    series: [{
        name: '模拟数据',
        type: 'line',
        smooth: true,
        symbol: 'none',
        smoothMonotone: 'x',
        sampling: 'average',
        hoverAnimation: false,
        lineStyle: {
            normal: {
                width: 1,
                color: 'rgb(160, 101, 99)'
            }
        },
        areaStyle: {
            normal: {
                color: new echarts.graphic.LinearGradient(0, 0, 0, 1, [{
                    offset: 0,
                    color: 'rgba(194, 94, 72,0.56)'
                }, {
                    offset: 1,
                    color: 'rgba(255, 255, 255,0.56)'
                }])
            }
        },
        data: lineData
    }]
};


//K线图
var rawData = [["2015/12/31", "3570.47", "3539.18", "-33.69", "-0.94%", "3538.35", "3580.6", "176963664", "25403106", "-"], ["2015/12/30", "3566.73", "3572.88", "9.14", "0.26%", "3538.11", "3573.68", "187889600", "26778766", "-"], ["2015/12/29", "3528.4", "3563.74", "29.96", "0.85%", "3515.52", "3564.17", "182551920", "25093890", "-"], ["2015/12/28", "3635.77", "3533.78", "-94.13", "-2.59%", "3533.78", "3641.59", "269983264", "36904280", "-"], ["2015/12/25", "3614.05", "3627.91", "15.43", "0.43%", "3601.74", "3635.26", "198451120", "27466004", "-"], ["2015/12/24", "3631.31", "3612.49", "-23.6", "-0.65%", "3572.28", "3640.22", "227785216", "31542126", "-"], ["2015/12/23", "3653.28", "3636.09", "-15.68", "-0.43%", "3633.03", "3684.57", "298201792", "41990292", "-"], ["2015/12/22", "3645.99", "3651.77", "9.3", "0.26%", "3616.87", "3652.63", "261178752", "36084604", "-"], ["2015/12/21", "3568.58", "3642.47", "63.51", "1.77%", "3565.75", "3651.06", "299849280", "39831696", "-"], ["2015/12/18", "3574.94", "3578.96", "-1.03", "-0.03%", "3568.16", "3614.7", "273707904", "36538580", "-"], ["2015/12/17", "3533.63", "3580", "63.81", "1.81%", "3533.63", "3583.41", "283856480", "38143960", "-"], ["2015/12/16", "3522.09", "3516.19", "5.83", "0.17%", "3506.29", "3538.69", "193482304", "26528864", "-"], ["2015/12/15", "3518.13", "3510.35", "-10.31", "-0.29%", "3496.85", "3529.96", "200471344", "27627494", "-"], ["2015/12/14", "3403.51", "3520.67", "86.09", "2.51%", "3399.28", "3521.78", "215374624", "27921354", "-"], ["2015/12/11", "3441.6", "3434.58", "-20.91", "-0.61%", "3410.92", "3455.55", "182908880", "24507642", "-"], ["2015/12/10", "3469.81", "3455.5", "-16.94", "-0.49%", "3446.27", "3503.65", "200427520", "27949970", "-"], ["2015/12/9", "3462.58", "3472.44", "2.37", "0.07%", "3454.88", "3495.7", "195698848", "26785488", "-"], ["2015/12/8", "3518.65", "3470.07", "-66.86", "-1.89%", "3466.79", "3518.65", "224367312", "29782174", "-"], ["2015/12/7", "3529.81", "3536.93", "11.94", "0.34%", "3506.62", "3543.95", "208302576", "28056158", "-"], ["2015/12/4", "3558.15", "3524.99", "-59.83", "-1.67%", "3510.41", "3568.97", "251736416", "31976682", "-"], ["2015/12/3", "3525.73", "3584.82", "47.92", "1.35%", "3517.23", "3591.73", "281111232", "33885908", "-"], ["2015/12/2", "3450.28", "3536.91", "80.6", "2.33%", "3427.66", "3538.85", "301491488", "36918304", "-"], ["2015/12/1", "3442.44", "3456.31", "10.9", "0.32%", "3417.54", "3483.41", "252390752", "33025674", "-"], ["2015/11/30", "3433.85", "3445.4", "9.1", "0.26%", "3327.81", "3470.37", "304197888", "38750364", "-"], ["2015/11/27", "3616.54", "3436.3", "-199.25", "-5.48%", "3412.43", "3621.9", "354287520", "46431124", "-"], ["2015/11/26", "3659.57", "3635.55", "-12.38", "-0.34%", "3629.86", "3668.38", "306761600", "42624744", "-"], ["2015/11/25", "3614.07", "3647.93", "31.82", "0.88%", "3607.52", "3648.37", "273024864", "38080292", "-"], ["2015/11/24", "3602.89", "3616.11", "5.79", "0.16%", "3563.1", "3616.48", "248810512", "32775852", "-"], ["2015/11/23", "3630.87", "3610.31", "-20.18", "-0.56%", "3598.87", "3654.75", "315997472", "41414824", "-"], ["2015/11/20", "3620.79", "3630.5", "13.44", "0.37%", "3607.92", "3640.53", "310801984", "41391088", "-"]].reverse();

function calculateMA(dayCount, data) {
    var result = [];
    for (var i = 0, len = data.length; i < len; i++) {
        if (i < dayCount) {
            result.push('-');
            continue;
        }
        var sum = 0;
        for (var j = 0; j < dayCount; j++) {
            sum += data[i - j][1];
        }
        result.push(sum / dayCount);
    }
    return result;
}


var kDates = rawData.map(function (item) {
    return item[0];
});

var kData = rawData.map(function (item) {
    return [+item[1], +item[2], +item[5], +item[6]];
});


KOption = {
    tooltip: {
        trigger: 'axis',
        confine: true,
        backgroundColor: 'rgba(51,51,51,0.78)',
        padding: [5, 15],
        position: function (pt) {
            return [pt[0], '10%'];
        },
        axisPointer: {
            animation:false,
            lineStyle: {
                color: '#e84200',
                width: 1
            }
        },
        formatter: function (params) {
            params = params[0];
            var date = params.name;
            return date + '<br>' + '开盘：' + params.value[0] + '  最高：' + params.value[3] + '<br>' + '收盘：' + params.value[1] + '  最低：' + params.value[2];
        },
        textStyle: {
            fontSize: fontSize,
            color: '#fff'
        }
    },
    grid: {
        left: dataDpr * 12,
        top: dataDpr * 12,
        right: dataDpr * 12,
        bottom: dataDpr * 20
    },
    xAxis: {
        type: 'category',
        data: kDates,
        splitLine: {
            show: false,
            lineStyle: {
                type: 'dotted'
            }
        },
        axisTick: {
            show: false
        },
        axisLine: {
            show: false,
            onZero: false
        },
        axisLabel: {
            textStyle: {
                fontSize: fontSize,
                color: '#999',
            },
            interval: 9
        },
    },
    yAxis: {
        type: 'value',
        boundaryGap: ['10%', '5%'],
        scale: true,
        splitLine: {
            show: false,
            lineStyle: {
                color: '#ddd',
                type: 'solid'
            }
        },
        axisLine: {
            show: false,
            onZero: false
        },
        axisTick: {
            show: false
        },
        axisLabel: {
            textStyle: {
                fontSize: fontSize,
                color: '#999',
            },
            inside: true
        },
        z: 5
    },
    series: [
        {
            type: 'candlestick',
            name: '日K',
            data: kData,
            itemStyle: {
                normal: {
                    color: '#e63234',
                    color0: '#1eb83f',
                    borderColor: '#e63234',
                    borderColor0: '#1eb83f'
                }
            }
        }
    ]
}
      