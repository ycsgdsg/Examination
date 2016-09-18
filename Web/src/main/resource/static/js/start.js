(function() {
    $(function () {
        $('#start').on('click', function() {
            clickLoginButton();
        });
        optimizeWindow();
    });

})();

function clickLoginButton() {
    var $btn = $('#login');
    var url = $btn.attr("url");
    var formData = new Object();
}

function optimizeWindow() {
    var browser_width  = $(document.body).width();
    $("div.bg").css("width",browser_width);
    $(window).resize(function() {
        browser_width  = $(document.body).width();
        $("div.bg").css("width",browser_width);
    });
}

function getHostTree() {
    return  [
        {
            text: "All",
            nodes: [
                {
                    text: "Nucleus",
                    nodes: [
                        {
                            text: "eanshlt2nucleus01.eash.lt.ea.com"
                        },
                        {
                            text: "eanshlt2nucleus02.eash.lt.ea.com"

                        }
                    ]
                },
                {
                    text: "Commerce",
                    nodes: [
                        {
                            text: "eanshlt2commerce01.eash.lt.ea.com"
                        },
                        {
                            text: "eanshlt2commerce02.eash.lt.ea.com"

                        }
                    ]
                },
                {
                    text: "Accounts",
                    nodes: [
                        {
                            text: "eanshlt2accounts01.eash.lt.ea.com"
                        },
                        {
                            text: "eanshlt2accounts02.eash.lt.ea.com"

                        }
                    ]
                }
            ]
        }
    ];

}
