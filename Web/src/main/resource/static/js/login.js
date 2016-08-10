(function() {
    $(function () {
        $('#host-tree').treeview({
            data: getHostTree(),
            backColor : '#F2F3F4'
        });
    });

})();

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
